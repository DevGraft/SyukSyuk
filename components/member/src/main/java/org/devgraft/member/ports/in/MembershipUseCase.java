package org.devgraft.member.ports.in;

public interface MembershipUseCase {
    MembershipResult membership(final MembershipRequest request);

    public static class MembershipRequest {

    }

    public static class MembershipResult {

    }
}
