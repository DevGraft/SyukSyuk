package org.devgraft.member.adapters.in;

import lombok.RequiredArgsConstructor;
import org.devgraft.member.ports.in.MembershipUseCase;

@RequiredArgsConstructor
public class MemberController {
    private final MembershipUseCase membershipUseCase;

    public MembershipUseCase.MembershipResult membership(final MembershipUseCase.MembershipRequest request) {
        return membershipUseCase.membership(request);
    }
}
