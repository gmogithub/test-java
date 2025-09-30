package org.example.sealed;

import org.example.sealed.enums.TypeEnum;
import org.example.sealed.payload.Data1;
import org.example.sealed.payload.Data2;

public sealed interface ITestSealedPayload permits Payload1, Payload2 {
    TypeEnum getType();
}
