package com.android.volley;

/**
 * Indicates that there was an {@link OutOfMemoryError} network error when
 * performing a Volley request.
 */
@SuppressWarnings("serial")
public class OOMError extends VolleyError {
    public OOMError() {
        super();
    }

    public OOMError(Throwable cause) {
        super(cause);
    }
}
