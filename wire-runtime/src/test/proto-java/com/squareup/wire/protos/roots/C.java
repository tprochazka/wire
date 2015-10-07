// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: roots.proto at 43:1
package com.squareup.wire.protos.roots;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

public final class C extends Message<C, C.Builder> {
  public static final ProtoAdapter<C> ADAPTER = new ProtoAdapter<C>(FieldEncoding.LENGTH_DELIMITED, C.class) {
    @Override
    public int encodedSize(C value) {
      return (value.i != null ? ProtoAdapter.INT32.encodedSizeWithTag(1, value.i) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, C value) throws IOException {
      if (value.i != null) ProtoAdapter.INT32.encodeWithTag(writer, 1, value.i);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public C decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.i(ProtoAdapter.INT32.decode(reader)); break;
          default: {
            FieldEncoding fieldEncoding = reader.peekFieldEncoding();
            Object value = fieldEncoding.rawProtoAdapter().decode(reader);
            builder.addUnknownField(tag, fieldEncoding, value);
          }
        }
      }
      reader.endMessage(token);
      return builder.build();
    }

    @Override
    public C redact(C value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  };

  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_I = 0;

  public final Integer i;

  public C(Integer i) {
    this(i, ByteString.EMPTY);
  }

  public C(Integer i, ByteString unknownFields) {
    super(unknownFields);
    this.i = i;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.i = i;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof C)) return false;
    C o = (C) other;
    return equals(unknownFields(), o.unknownFields())
        && equals(i, o.i);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (i != null ? i.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (i != null) builder.append(", i=").append(i);
    return builder.replace(0, 2, "C{").append('}').toString();
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<C, Builder> {
    public Integer i;

    public Builder() {
    }

    public Builder i(Integer i) {
      this.i = i;
      return this;
    }

    @Override
    public C build() {
      return new C(i, buildUnknownFields());
    }
  }
}
