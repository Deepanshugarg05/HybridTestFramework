// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: coffee.proto

package com.coffee;

public interface CoffeeDescriptionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:coffee.CoffeeDescription)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * coffee req id
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * coffee req id
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * coffee name
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * coffee name
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * coffee flavour
   * </pre>
   *
   * <code>string flavour = 3;</code>
   * @return The flavour.
   */
  java.lang.String getFlavour();
  /**
   * <pre>
   * coffee flavour
   * </pre>
   *
   * <code>string flavour = 3;</code>
   * @return The bytes for flavour.
   */
  com.google.protobuf.ByteString
      getFlavourBytes();

  /**
   * <pre>
   * coffee aroma
   * </pre>
   *
   * <code>string aroma = 4;</code>
   * @return The aroma.
   */
  java.lang.String getAroma();
  /**
   * <pre>
   * coffee aroma
   * </pre>
   *
   * <code>string aroma = 4;</code>
   * @return The bytes for aroma.
   */
  com.google.protobuf.ByteString
      getAromaBytes();

  /**
   * <pre>
   * coffee size
   * </pre>
   *
   * <code>.coffee.CoffeeSize coffeeSize = 5;</code>
   * @return The enum numeric value on the wire for coffeeSize.
   */
  int getCoffeeSizeValue();
  /**
   * <pre>
   * coffee size
   * </pre>
   *
   * <code>.coffee.CoffeeSize coffeeSize = 5;</code>
   * @return The coffeeSize.
   */
  com.coffee.CoffeeSize getCoffeeSize();

  /**
   * <pre>
   * coffee description
   * </pre>
   *
   * <code>string Description = 6;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * coffee description
   * </pre>
   *
   * <code>string Description = 6;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>.google.protobuf.Timestamp last_updated = 7;</code>
   * @return Whether the lastUpdated field is set.
   */
  boolean hasLastUpdated();
  /**
   * <code>.google.protobuf.Timestamp last_updated = 7;</code>
   * @return The lastUpdated.
   */
  com.google.protobuf.Timestamp getLastUpdated();
  /**
   * <code>.google.protobuf.Timestamp last_updated = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastUpdatedOrBuilder();
}
