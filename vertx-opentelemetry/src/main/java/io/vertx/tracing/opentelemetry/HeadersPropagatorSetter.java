/*
 * Copyright (c) 2011-2020 Contributors to the Eclipse Foundation
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0, or the Apache License, Version 2.0
 * which is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0 OR Apache-2.0
 */
package io.vertx.tracing.opentelemetry;

import io.opentelemetry.context.propagation.TextMapPropagator.Setter;

import java.util.function.BiConsumer;

public class HeadersPropagatorSetter implements Setter<BiConsumer<String, String>> {

  @Override
  public void set(final BiConsumer<String, String> carrier, final String key, final String value) {
    if (carrier == null) {
      return;
    }
    carrier.accept(key, value);
  }
}
