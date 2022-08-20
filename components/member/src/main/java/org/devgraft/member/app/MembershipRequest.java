package org.devgraft.member.app;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class MembershipRequest {
    private String memberId;
    private String password;
    private String nickname;
    private String profileImage;
}
