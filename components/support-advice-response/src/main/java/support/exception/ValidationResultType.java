package support.exception;

public enum ValidationResultType {
    Error {
        @Override
        public boolean isError() {
            return true;
        }
    }, Ok {
        @Override
        public boolean isOk() {
            return true;
        }
    }, Pass {
        @Override
        public boolean isPass() {
            return true;
        }
    };

    public boolean isError() {
        return false;
    }

    public boolean isOk() {
        return false;
    }

    public boolean isPass() {
        return false;
    }
}
