package org.devgraft.member.ports.out;

import org.devgraft.member.domain.Member;

public interface MemberSavePort {
    Long save(final Member member);
}
