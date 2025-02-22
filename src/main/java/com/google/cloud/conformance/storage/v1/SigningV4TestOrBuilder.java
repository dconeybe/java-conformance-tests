/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/conformance/storage/v1/tests.proto

package com.google.cloud.conformance.storage.v1;

public interface SigningV4TestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.conformance.storage.v1.SigningV4Test)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string fileName = 1;</code>
   *
   * @return The fileName.
   */
  java.lang.String getFileName();

  /**
   * <code>string fileName = 1;</code>
   *
   * @return The bytes for fileName.
   */
  com.google.protobuf.ByteString getFileNameBytes();

  /**
   * <code>string description = 2;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();

  /**
   * <code>string description = 2;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   * <code>string bucket = 3;</code>
   *
   * @return The bucket.
   */
  java.lang.String getBucket();

  /**
   * <code>string bucket = 3;</code>
   *
   * @return The bytes for bucket.
   */
  com.google.protobuf.ByteString getBucketBytes();

  /**
   * <code>string object = 4;</code>
   *
   * @return The object.
   */
  java.lang.String getObject();

  /**
   * <code>string object = 4;</code>
   *
   * @return The bytes for object.
   */
  com.google.protobuf.ByteString getObjectBytes();

  /**
   * <code>string method = 5;</code>
   *
   * @return The method.
   */
  java.lang.String getMethod();

  /**
   * <code>string method = 5;</code>
   *
   * @return The bytes for method.
   */
  com.google.protobuf.ByteString getMethodBytes();

  /**
   * <code>int64 expiration = 6;</code>
   *
   * @return The expiration.
   */
  long getExpiration();

  /**
   * <code>.google.protobuf.Timestamp timestamp = 7;</code>
   *
   * @return Whether the timestamp field is set.
   */
  boolean hasTimestamp();

  /**
   * <code>.google.protobuf.Timestamp timestamp = 7;</code>
   *
   * @return The timestamp.
   */
  com.google.protobuf.Timestamp getTimestamp();

  /** <code>.google.protobuf.Timestamp timestamp = 7;</code> */
  com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder();

  /**
   * <code>string expectedUrl = 8;</code>
   *
   * @return The expectedUrl.
   */
  java.lang.String getExpectedUrl();

  /**
   * <code>string expectedUrl = 8;</code>
   *
   * @return The bytes for expectedUrl.
   */
  com.google.protobuf.ByteString getExpectedUrlBytes();

  /** <code>map&lt;string, string&gt; headers = 9;</code> */
  int getHeadersCount();

  /** <code>map&lt;string, string&gt; headers = 9;</code> */
  boolean containsHeaders(java.lang.String key);

  /** Use {@link #getHeadersMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getHeaders();

  /** <code>map&lt;string, string&gt; headers = 9;</code> */
  java.util.Map<java.lang.String, java.lang.String> getHeadersMap();

  /** <code>map&lt;string, string&gt; headers = 9;</code> */
  /* nullable */
  java.lang.String getHeadersOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /** <code>map&lt;string, string&gt; headers = 9;</code> */
  java.lang.String getHeadersOrThrow(java.lang.String key);

  /** <code>map&lt;string, string&gt; query_parameters = 10;</code> */
  int getQueryParametersCount();

  /** <code>map&lt;string, string&gt; query_parameters = 10;</code> */
  boolean containsQueryParameters(java.lang.String key);

  /** Use {@link #getQueryParametersMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getQueryParameters();

  /** <code>map&lt;string, string&gt; query_parameters = 10;</code> */
  java.util.Map<java.lang.String, java.lang.String> getQueryParametersMap();

  /** <code>map&lt;string, string&gt; query_parameters = 10;</code> */
  /* nullable */
  java.lang.String getQueryParametersOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /** <code>map&lt;string, string&gt; query_parameters = 10;</code> */
  java.lang.String getQueryParametersOrThrow(java.lang.String key);

  /**
   * <code>string scheme = 11;</code>
   *
   * @return The scheme.
   */
  java.lang.String getScheme();

  /**
   * <code>string scheme = 11;</code>
   *
   * @return The bytes for scheme.
   */
  com.google.protobuf.ByteString getSchemeBytes();

  /**
   * <code>.google.cloud.conformance.storage.v1.UrlStyle urlStyle = 12;</code>
   *
   * @return The enum numeric value on the wire for urlStyle.
   */
  int getUrlStyleValue();

  /**
   * <code>.google.cloud.conformance.storage.v1.UrlStyle urlStyle = 12;</code>
   *
   * @return The urlStyle.
   */
  com.google.cloud.conformance.storage.v1.UrlStyle getUrlStyle();

  /**
   * <code>string bucketBoundHostname = 13;</code>
   *
   * @return The bucketBoundHostname.
   */
  java.lang.String getBucketBoundHostname();

  /**
   * <code>string bucketBoundHostname = 13;</code>
   *
   * @return The bytes for bucketBoundHostname.
   */
  com.google.protobuf.ByteString getBucketBoundHostnameBytes();

  /**
   * <code>string expectedCanonicalRequest = 14;</code>
   *
   * @return The expectedCanonicalRequest.
   */
  java.lang.String getExpectedCanonicalRequest();

  /**
   * <code>string expectedCanonicalRequest = 14;</code>
   *
   * @return The bytes for expectedCanonicalRequest.
   */
  com.google.protobuf.ByteString getExpectedCanonicalRequestBytes();

  /**
   * <code>string expectedStringToSign = 15;</code>
   *
   * @return The expectedStringToSign.
   */
  java.lang.String getExpectedStringToSign();

  /**
   * <code>string expectedStringToSign = 15;</code>
   *
   * @return The bytes for expectedStringToSign.
   */
  com.google.protobuf.ByteString getExpectedStringToSignBytes();
}
