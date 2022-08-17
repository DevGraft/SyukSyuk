package org.devgraft.auth.structure.core;

public interface VerityAuthTokenUseCase<T extends VerityAuthTokenUseCase.VerityAuthTokenRequest, R extends VerityAuthTokenUseCase.VerityAuthTokenResult> {
    R verityAuthToken(T request);

    public abstract static class VerityAuthTokenRequest {

    }

    public abstract static class VerityAuthTokenResult {

    }
}
