package org.devgraft.auth.structure.core;

public interface GeneratedAuthTokenUseCase<T extends GeneratedAuthTokenUseCase.GeneratedAuthTokenRequest, R extends GeneratedAuthTokenUseCase.GeneratedAuthTokenResult> {

    R generatedAuthToken(T request);

    public abstract static class GeneratedAuthTokenRequest {

    }

    public abstract static class GeneratedAuthTokenResult {

    }
}
