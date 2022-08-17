package org.devgraft.member.adapters.out;

import lombok.RequiredArgsConstructor;
import org.devgraft.member.domain.Member;
import org.devgraft.member.ports.out.MemberSavePort;
import org.springframework.stereotype.Component;

/**
 * outbound port 의 구현체를 adapter로 봐야할지
 * 단순히 구현했다고 adapter로 전환되는건 이상한데... 명명규칙문제고
 * 개인적으로 memberRepository 즉 DAO가 adapter라고 생각한다.
 */
@RequiredArgsConstructor
@Component
public class MemberAdapter implements MemberSavePort {
    private final MemberRepository memberRepository;
    @Override
    public Long save(Member member) {
        return null;
    }
}
