
    @Transactional(readOnly = true)
    @Override
    public Long getMemberId(final String identifyToken) {
        return memberRepository.findByIdentifyToken(identifyToken)
                .map(Member::getIdx)
                .orElseThrow(RuntimeException::new);
    }

    @Transactional(readOnly = true)
    @Override
    public MemberGetResponse getMember(final Long memberId) {
        Member member = memberRepository.findById(memberId)
                .orElseThrow(RuntimeException::new);
        return MemberGetResponse.of(member.getId(), member.getNickname(), member.getProfileImage(), member.getStateMessage());
    }

    @Override
    public void updateMember(Long memberId, MemberUpdateRequest request) {
        memberRepository.findById(memberId)
                .orElseThrow(RuntimeException::new)
                .updateProfile(request.getNickname(), request.getStateMessage());
    }
}