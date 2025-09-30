package org.example.sealed;

import org.example.sealed.enums.TypeEnum;
import org.example.sealed.payload.Data2;

public final class Payload2 implements ITestSealedPayload {

    private final Data2 data;
    public Payload2(Data2 data2) {
        this.data = data2;
    }

    public Data2 getData() {
        return data;
    }

    @Override
    public TypeEnum getType() {
        return null;
    }
}
