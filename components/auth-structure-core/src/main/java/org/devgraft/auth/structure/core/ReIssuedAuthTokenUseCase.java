package org.devgraft.auth.structure.core;

public interface ReIssuedAuthTokenUseCase<T extends ReIssuedAuthTokenUseCase.ReIssuedAuthTokenRequest, R extends ReIssuedAuthTokenUseCase.ReIssuedAuthTokenResult> {

    R reIssuedAuthToken(T request);

    public abstract static class ReIssuedAuthTokenRequest {

    }

    public abstract static class ReIssuedAuthTokenResult {

    }
}
