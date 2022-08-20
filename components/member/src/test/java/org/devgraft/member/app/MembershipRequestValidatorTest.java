package org.devgraft.member.app;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import support.exception.ValidationError;

import java.util.List;

class MembershipRequestValidatorTest {
    MembershipRequestValidator validator = new MembershipRequestValidator();

    // 여기는 입력된 값이 정상적인지 검사만 하는 곳

    // 필수 입력 값들 공백 체크
    @DisplayName("회원가입 필수 입력 요소 검사")
    @Test
    void requiredElementsCheck() {
        //given
        MembershipRequest request = MembershipRequest.builder()
                .memberId("qweqwe123")
                .password("asdasda123!@#")
                .nickname("member")
                .build();
        List<ValidationError> errors = validator.validate(request);

    }

    // 아이디 정규식 확인
    // 패스워드 정규식 확인
    // 별명 정규식 확인

}