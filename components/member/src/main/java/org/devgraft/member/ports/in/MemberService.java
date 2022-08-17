package org.devgraft.member.ports.in;

import lombok.RequiredArgsConstructor;
import org.devgraft.member.domain.Member;
import org.devgraft.member.ports.out.MemberSavePort;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberService implements MembershipUseCase {
    private final MemberSavePort memberSavePort;
    @Override
    public MembershipResult membership(final MembershipRequest request) {
        final Member member = new Member();
        memberSavePort.save(member);
        return null;
    }
}
