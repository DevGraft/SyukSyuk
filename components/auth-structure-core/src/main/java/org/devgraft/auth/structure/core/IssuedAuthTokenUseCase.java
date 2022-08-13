package org.devgraft.auth.structure.core;

public interface IssuedAuthTokenUseCase<T extends IssuedAuthTokenUseCase.IssuedAuthTokenRequest, R extends IssuedAuthTokenUseCase.IssuedAuthTokenResult> {
    R issuedAuthToken(T request);

    public abstract static class IssuedAuthTokenRequest {

    }

    public abstract static class IssuedAuthTokenResult {

    }
}
