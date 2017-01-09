package io.vithor.yamvpframework.rest

/**
 * Created by Guizion on 13/06/16.
 */

class HttpStatusCode(val statusCode: Int = 0) {
    enum class Status {
        Unknown,
        None,
        Continue,
        SwitchingProtocols,
        Processing,
        OK,
        Created,
        Accepted,
        NonAuthoritativeInformation,
        NoContent,
        ResetContent,
        PartialContent,
        MultiStatus,
        AlreadyReported,
        IMUsed,
        MultipleChoices,
        MovedPermanently,
        Found,
        SeeOther,
        NotModified,
        UseProxy,
        TemporaryRedirect,
        PermanentRedirect,
        BadRequest,
        Unauthorized,
        PaymentRequired,
        Forbidden,
        NotFound,
        MethodNotAllowed,
        NotAcceptable,
        ProxyAuthenticationRequired,
        RequestTimeout,
        Conflict,
        Gone,
        LengthRequired,
        PreconditionFailed,
        PayloadTooLarge,
        RequestURITooLong,
        UnsupportedMediaType,
        RequestedRangeNotSatisfiable,
        ExpectationFailed,
        IMATeapot,
        MisdirectedRequest,
        UnprocessableEntity,
        Locked,
        FailedDependency,
        UpgradeRequired,
        PreconditionRequired,
        TooManyRequests,
        RequestHeaderFieldsTooLarge,
        UnavailableForLegalReasons,
        ClientClosedRequest,
        InternalServerError,
        NotImplemented,
        BadGateway,
        ServiceUnavailable,
        GatewayTimeout,
        HTTPVersionNotSupported,
        VariantAlsoNegotiates,
        InsufficientStorage,
        LoopDetected,
        NotExtended,
        NetworkAuthenticationRequired,
        NetworkConnectTimeoutError
    }

    val description: Status
        get() {
            return Description.statusCodes[statusCode] ?: Status.Unknown
        }

    fun statusCodeFor(description: String): Int? {
        if (Description.statusCodes.containsValue(Status.valueOf(description))) {
            for ((key, value) in Description.statusCodes) {
                if (value.equals(description)) {
                    return key
                }
            }
        }
        return null
    }

    object Description {
        val statusCodes = mapOf(
                0 to Status.None,
                100 to Status.Continue,
                101 to Status.SwitchingProtocols,
                102 to Status.Processing,
                200 to Status.OK,
                201 to Status.Created,
                202 to Status.Accepted,
                203 to Status.NonAuthoritativeInformation,
                204 to Status.NoContent,
                205 to Status.ResetContent,
                206 to Status.PartialContent,
                207 to Status.MultiStatus,
                208 to Status.AlreadyReported,
                226 to Status.IMUsed,
                300 to Status.MultipleChoices,
                301 to Status.MovedPermanently,
                302 to Status.Found,
                303 to Status.SeeOther,
                304 to Status.NotModified,
                305 to Status.UseProxy,
                307 to Status.TemporaryRedirect,
                308 to Status.PermanentRedirect,
                400 to Status.BadRequest,
                401 to Status.Unauthorized,
                402 to Status.PaymentRequired,
                403 to Status.Forbidden,
                404 to Status.NotFound,
                405 to Status.MethodNotAllowed,
                406 to Status.NotAcceptable,
                407 to Status.ProxyAuthenticationRequired,
                408 to Status.RequestTimeout,
                409 to Status.Conflict,
                410 to Status.Gone,
                411 to Status.LengthRequired,
                412 to Status.PreconditionFailed,
                413 to Status.PayloadTooLarge,
                414 to Status.RequestURITooLong,
                415 to Status.UnsupportedMediaType,
                416 to Status.RequestedRangeNotSatisfiable,
                417 to Status.ExpectationFailed,
                418 to Status.IMATeapot,
                421 to Status.MisdirectedRequest,
                422 to Status.UnprocessableEntity,
                423 to Status.Locked,
                424 to Status.FailedDependency,
                426 to Status.UpgradeRequired,
                428 to Status.PreconditionRequired,
                429 to Status.TooManyRequests,
                431 to Status.RequestHeaderFieldsTooLarge,
                451 to Status.UnavailableForLegalReasons,
                499 to Status.ClientClosedRequest,
                500 to Status.InternalServerError,
                501 to Status.NotImplemented,
                502 to Status.BadGateway,
                503 to Status.ServiceUnavailable,
                504 to Status.GatewayTimeout,
                505 to Status.HTTPVersionNotSupported,
                506 to Status.VariantAlsoNegotiates,
                507 to Status.InsufficientStorage,
                508 to Status.LoopDetected,
                510 to Status.NotExtended,
                511 to Status.NetworkAuthenticationRequired,
                599 to Status.NetworkConnectTimeoutError
        )
    }

}