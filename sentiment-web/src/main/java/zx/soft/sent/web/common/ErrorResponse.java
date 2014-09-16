package zx.soft.sent.web.common;

/**
 * 错误相应类
 * 
 * @author wanggang
 *
 */
public class ErrorResponse {

	private final int errorCode;
	private final String errorMessage;

	public ErrorResponse(Builder builder) {
		this.errorCode = builder.errorCode;
		this.errorMessage = builder.errorMessage;
	}

	public static class Builder {

		private final int errorCode;
		private final String errorMessage;

		public Builder(int errorCode, String errorMessage) {
			super();
			this.errorCode = errorCode;
			this.errorMessage = errorMessage;
		}

		public ErrorResponse build() {
			return new ErrorResponse(this);
		}

	}

	public int getErrorCode() {
		return errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

}
