/*
 * Copyright 2015 DiffPlug
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.diffplug.common.base;


/**
 * Variations on the standard functional interfaces which throw Throwable.
 * <p>
 * {@link Errors} can convert these into standard functional interfaces.
 */
public interface Throwing {
	/** Variations on the standard functional interfaces which throw a specific subclass of Throwable. */
	public interface Specific {
		public interface Runnable<E extends Throwable> {
			void run() throws E;
		}

		public interface Supplier<T, E extends Throwable> {
			T get() throws E;
		}

		public interface Consumer<T, E extends Throwable> {
			void accept(T t) throws E;
		}

		public interface Function<T, R, E extends Throwable> {
			R apply(T t) throws E;
		}

		public interface Predicate<T, E extends Throwable> {
			boolean test(T t) throws E;
		}

		public interface BiConsumer<T, U, E extends Throwable> {
			void accept(T t, U u) throws E;
		}

		public interface BiFunction<T, U, R, E extends Throwable> {
			R apply(T t, U u) throws E;
		}

		public interface BiPredicate<T, U, E extends Throwable> {
			boolean accept(T t, U u) throws E;
		}
	}

	public interface Runnable extends Specific.Runnable<Throwable> {}

	public interface Supplier<T> extends Specific.Supplier<T, Throwable> {}

	public interface Consumer<T> extends Specific.Consumer<T, Throwable> {}

	public interface Function<T, R> extends Specific.Function<T, R, Throwable> {}

	public interface Predicate<T> extends Specific.Predicate<T, Throwable> {}

	public interface BiConsumer<T, U> extends Specific.BiConsumer<T, U, Throwable> {}

	public interface BiFunction<T, U, R> extends Specific.BiFunction<T, U, R, Throwable> {}

	public interface BiPredicate<T, U> extends Specific.BiPredicate<T, U, Throwable> {}
}
