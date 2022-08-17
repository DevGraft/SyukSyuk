package org.devgraft.auth.structure.core;

import lombok.RequiredArgsConstructor;
import org.devgraft.auth.structure.core.GeneratedAuthTokenUseCase.GeneratedAuthTokenResult;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public final class IssuedAuthTokenService implements IssuedAuthTokenUseCase{
    private final GeneratedAuthTokenUseCase generatedAuthTokenUseCase;
    @Override
    public IssuedAuthTokenResult issuedAuthToken(IssuedAuthTokenRequest request) {

        GeneratedAuthTokenResult generatedAuthTokenResult = generatedAuthTokenUseCase.generatedAuthToken(null);

        return new IssuedAuthTokenResult();
    }
}
