package org.devgraft.member;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.devgraft.jpa.BaseEntity;
import org.springframework.util.Assert;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 작성자: PCloud
 * 작성일자: 2022-08-08
 * 마지막 업데이트 일자: 2022-08-09
 */
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
public class Member extends BaseEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;
    @Column(name = "id", unique = true)
    private String id;
    @Column(name = "password")
    private String password;
    @Column(name = "nickname")
    private String nickname;
    @Column(name = "profile_image")
    private String profileImage;
    @Column(name = "state_message")
    private String stateMessage;
    @Column(name = "status")
    private MemberStatus status;

    @Builder(access = AccessLevel.PROTECTED)
    private Member(final Long idx, final String id, final String password, final String nickname, final String profileImage, final String stateMessage, final MemberStatus status) {
        this.idx = idx;
        this.id = id;
        this.password = password;
        this.nickname = nickname;
        this.profileImage = profileImage;
        this.stateMessage = stateMessage;
        this.status = status;
    }

    public static Member of(final String id, final String password, final String nickname, final String profileImage, final String stateMessage, final MemberStatus status) {
        Assert.notNull(id, "id must not be null");
        Assert.notNull(password, "password must not be null");
        Assert.notNull(nickname, "nickname must not be null");
        Assert.notNull(status, "status must not be null");
        return new Member(null, id, password, nickname, profileImage, stateMessage, status);
    }

    public void updateProfile(final String nickname, final String stateMessage) {
        Assert.notNull(nickname, "nickName must not be null");
        Assert.notNull(stateMessage, "stateMessage must not be null");
        this.nickname = nickname;
        this.stateMessage = stateMessage;
    }
}
