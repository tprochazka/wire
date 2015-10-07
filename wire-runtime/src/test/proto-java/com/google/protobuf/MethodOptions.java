// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: google/protobuf/descriptor.proto at 411:1
package com.google.protobuf;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.List;
import okio.ByteString;

public final class MethodOptions extends Message<MethodOptions, MethodOptions.Builder> {
  public static final ProtoAdapter<MethodOptions> ADAPTER = new ProtoAdapter<MethodOptions>(FieldEncoding.LENGTH_DELIMITED, MethodOptions.class) {
    @Override
    public int encodedSize(MethodOptions value) {
      return UninterpretedOption.ADAPTER.asRepeated().encodedSizeWithTag(999, value.uninterpreted_option)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, MethodOptions value) throws IOException {
      if (value.uninterpreted_option != null) UninterpretedOption.ADAPTER.asRepeated().encodeWithTag(writer, 999, value.uninterpreted_option);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public MethodOptions decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 999: builder.uninterpreted_option.add(UninterpretedOption.ADAPTER.decode(reader)); break;
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
    public MethodOptions redact(MethodOptions value) {
      Builder builder = value.newBuilder();
      redactElements(builder.uninterpreted_option, UninterpretedOption.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  };

  private static final long serialVersionUID = 0L;

  /**
   * Note:  Field numbers 1 through 32 are reserved for Google's internal RPC
   *   framework.  We apologize for hoarding these numbers to ourselves, but
   *   we were already using them long before we decided to release Protocol
   *   Buffers.
   * The parser stores options it doesn't recognize here. See above.
   */
  public final List<UninterpretedOption> uninterpreted_option;

  public MethodOptions(List<UninterpretedOption> uninterpreted_option) {
    this(uninterpreted_option, ByteString.EMPTY);
  }

  public MethodOptions(List<UninterpretedOption> uninterpreted_option, ByteString unknownFields) {
    super(unknownFields);
    this.uninterpreted_option = immutableCopyOf(uninterpreted_option);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.uninterpreted_option = copyOf(uninterpreted_option);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof MethodOptions)) return false;
    MethodOptions o = (MethodOptions) other;
    return equals(unknownFields(), o.unknownFields())
        && equals(uninterpreted_option, o.uninterpreted_option);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (uninterpreted_option != null ? uninterpreted_option.hashCode() : 1);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (uninterpreted_option != null) builder.append(", uninterpreted_option=").append(uninterpreted_option);
    return builder.replace(0, 2, "MethodOptions{").append('}').toString();
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<MethodOptions, Builder> {
    public List<UninterpretedOption> uninterpreted_option;

    public Builder() {
      uninterpreted_option = newMutableList();
    }

    /**
     * Note:  Field numbers 1 through 32 are reserved for Google's internal RPC
     *   framework.  We apologize for hoarding these numbers to ourselves, but
     *   we were already using them long before we decided to release Protocol
     *   Buffers.
     * The parser stores options it doesn't recognize here. See above.
     */
    public Builder uninterpreted_option(List<UninterpretedOption> uninterpreted_option) {
      checkElementsNotNull(uninterpreted_option);
      this.uninterpreted_option = uninterpreted_option;
      return this;
    }

    @Override
    public MethodOptions build() {
      return new MethodOptions(uninterpreted_option, buildUnknownFields());
    }
  }
}
