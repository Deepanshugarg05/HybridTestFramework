// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: coffee.proto

package com.coffee;

public interface GetCoffeeResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:coffee.GetCoffeeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .coffee.CoffeeDescription coffeeDescription = 1;</code>
   */
  java.util.List<com.coffee.CoffeeDescription> 
      getCoffeeDescriptionList();
  /**
   * <code>repeated .coffee.CoffeeDescription coffeeDescription = 1;</code>
   */
  com.coffee.CoffeeDescription getCoffeeDescription(int index);
  /**
   * <code>repeated .coffee.CoffeeDescription coffeeDescription = 1;</code>
   */
  int getCoffeeDescriptionCount();
  /**
   * <code>repeated .coffee.CoffeeDescription coffeeDescription = 1;</code>
   */
  java.util.List<? extends com.coffee.CoffeeDescriptionOrBuilder> 
      getCoffeeDescriptionOrBuilderList();
  /**
   * <code>repeated .coffee.CoffeeDescription coffeeDescription = 1;</code>
   */
  com.coffee.CoffeeDescriptionOrBuilder getCoffeeDescriptionOrBuilder(
      int index);
}
