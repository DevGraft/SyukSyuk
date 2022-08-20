package support.exception;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class ValidationError {
    private String field;
    private String message;

    public static ValidationError of(final String field, final String message) {
        return new ValidationError(field, message);
    }
}
