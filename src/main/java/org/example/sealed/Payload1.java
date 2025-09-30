package org.example.sealed;

import org.example.sealed.enums.TypeEnum;
import org.example.sealed.payload.Data1;

public final class Payload1 implements ITestSealedPayload {

    private final Data1 data1;

    public Payload1(Data1 data1) {
        this.data1 = data1;
    }

    public Data1 getData1() {
        return data1;
    }

    @Override
    public TypeEnum getType() {
        return null;
    }
}
