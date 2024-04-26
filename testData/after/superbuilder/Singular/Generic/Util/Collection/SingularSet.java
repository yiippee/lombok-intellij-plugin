// Generated by delombok at Tue Oct 01 19:53:35 GMT 2019

import java.util.Set;

public class SingularSet<T> {
	private Set rawTypes;
	private Set<Integer> integers;
	private Set<T> generics;
	private Set<? extends Number> extendsGenerics;


	@java.lang.SuppressWarnings("all")
	public static abstract class SingularSetBuilder<T, C extends SingularSet<T>, B extends SingularSetBuilder<T, C, B>> {
		@java.lang.SuppressWarnings("all")
		private java.util.ArrayList<java.lang.Object> rawTypes;
		@java.lang.SuppressWarnings("all")
		private java.util.ArrayList<Integer> integers;
		@java.lang.SuppressWarnings("all")
		private java.util.ArrayList<T> generics;
		@java.lang.SuppressWarnings("all")
		private java.util.ArrayList<Number> extendsGenerics;

		@java.lang.SuppressWarnings("all")
		protected abstract B self();

		@java.lang.SuppressWarnings("all")
		public abstract C build();

		@java.lang.SuppressWarnings("all")
		public B rawType(final java.lang.Object rawType) {
			if (this.rawTypes == null) this.rawTypes = new java.util.ArrayList<java.lang.Object>();
			this.rawTypes.add(rawType);
			return self();
		}

		@java.lang.SuppressWarnings("all")
		public B rawTypes(final java.util.Collection<?> rawTypes) {
			if (this.rawTypes == null) this.rawTypes = new java.util.ArrayList<java.lang.Object>();
			this.rawTypes.addAll(rawTypes);
			return self();
		}

		@java.lang.SuppressWarnings("all")
		public B clearRawTypes() {
			if (this.rawTypes != null) this.rawTypes.clear();
			return self();
		}

		@java.lang.SuppressWarnings("all")
		public B integer(final Integer integer) {
			if (this.integers == null) this.integers = new java.util.ArrayList<Integer>();
			this.integers.add(integer);
			return self();
		}

		@java.lang.SuppressWarnings("all")
		public B integers(final java.util.Collection<? extends Integer> integers) {
			if (this.integers == null) this.integers = new java.util.ArrayList<Integer>();
			this.integers.addAll(integers);
			return self();
		}

		@java.lang.SuppressWarnings("all")
		public B clearIntegers() {
			if (this.integers != null) this.integers.clear();
			return self();
		}

		@java.lang.SuppressWarnings("all")
		public B generic(final T generic) {
			if (this.generics == null) this.generics = new java.util.ArrayList<T>();
			this.generics.add(generic);
			return self();
		}

		@java.lang.SuppressWarnings("all")
		public B generics(final java.util.Collection<? extends T> generics) {
			if (this.generics == null) this.generics = new java.util.ArrayList<T>();
			this.generics.addAll(generics);
			return self();
		}

		@java.lang.SuppressWarnings("all")
		public B clearGenerics() {
			if (this.generics != null) this.generics.clear();
			return self();
		}

		@java.lang.SuppressWarnings("all")
		public B extendsGeneric(final Number extendsGeneric) {
			if (this.extendsGenerics == null) this.extendsGenerics = new java.util.ArrayList<Number>();
			this.extendsGenerics.add(extendsGeneric);
			return self();
		}

		@java.lang.SuppressWarnings("all")
		public B extendsGenerics(final java.util.Collection<? extends Number> extendsGenerics) {
			if (this.extendsGenerics == null) this.extendsGenerics = new java.util.ArrayList<Number>();
			this.extendsGenerics.addAll(extendsGenerics);
			return self();
		}

		@java.lang.SuppressWarnings("all")
		public B clearExtendsGenerics() {
			if (this.extendsGenerics != null) this.extendsGenerics.clear();
			return self();
		}

		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		public java.lang.String toString() {
			return "SingularSet.SingularSetBuilder(rawTypes=" + this.rawTypes + ", integers=" + this.integers + ", generics=" + this.generics + ", extendsGenerics=" + this.extendsGenerics + ")";
		}
	}


	@java.lang.SuppressWarnings("all")
	private static final class SingularSetBuilderImpl<T> extends SingularSetBuilder<T, SingularSet<T>, SingularSetBuilderImpl<T>> {
		@java.lang.SuppressWarnings("all")
		private SingularSetBuilderImpl() {
		}

		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		protected SingularSetBuilderImpl<T> self() {
			return this;
		}

		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		public SingularSet<T> build() {
			return new SingularSet<T>(this);
		}
	}

	@java.lang.SuppressWarnings("all")
	protected SingularSet(final SingularSetBuilder<T, ?, ?> b) {
		java.util.Set<java.lang.Object> rawTypes;
		switch (b.rawTypes == null ? 0 : b.rawTypes.size()) {
		case 0: 
			rawTypes = java.util.Collections.emptySet();
			break;
		case 1: 
			rawTypes = java.util.Collections.singleton(b.rawTypes.get(0));
			break;
		default: 
			rawTypes = new java.util.LinkedHashSet<java.lang.Object>(b.rawTypes.size() < 1073741824 ? 1 + b.rawTypes.size() + (b.rawTypes.size() - 3) / 3 : java.lang.Integer.MAX_VALUE);
			rawTypes.addAll(b.rawTypes);
			rawTypes = java.util.Collections.unmodifiableSet(rawTypes);
		}
		this.rawTypes = rawTypes;
		java.util.Set<Integer> integers;
		switch (b.integers == null ? 0 : b.integers.size()) {
		case 0: 
			integers = java.util.Collections.emptySet();
			break;
		case 1: 
			integers = java.util.Collections.singleton(b.integers.get(0));
			break;
		default: 
			integers = new java.util.LinkedHashSet<Integer>(b.integers.size() < 1073741824 ? 1 + b.integers.size() + (b.integers.size() - 3) / 3 : java.lang.Integer.MAX_VALUE);
			integers.addAll(b.integers);
			integers = java.util.Collections.unmodifiableSet(integers);
		}
		this.integers = integers;
		java.util.Set<T> generics;
		switch (b.generics == null ? 0 : b.generics.size()) {
		case 0: 
			generics = java.util.Collections.emptySet();
			break;
		case 1: 
			generics = java.util.Collections.singleton(b.generics.get(0));
			break;
		default: 
			generics = new java.util.LinkedHashSet<T>(b.generics.size() < 1073741824 ? 1 + b.generics.size() + (b.generics.size() - 3) / 3 : java.lang.Integer.MAX_VALUE);
			generics.addAll(b.generics);
			generics = java.util.Collections.unmodifiableSet(generics);
		}
		this.generics = generics;
		java.util.Set<Number> extendsGenerics;
		switch (b.extendsGenerics == null ? 0 : b.extendsGenerics.size()) {
		case 0: 
			extendsGenerics = java.util.Collections.emptySet();
			break;
		case 1: 
			extendsGenerics = java.util.Collections.singleton(b.extendsGenerics.get(0));
			break;
		default: 
			extendsGenerics = new java.util.LinkedHashSet<Number>(b.extendsGenerics.size() < 1073741824 ? 1 + b.extendsGenerics.size() + (b.extendsGenerics.size() - 3) / 3 : java.lang.Integer.MAX_VALUE);
			extendsGenerics.addAll(b.extendsGenerics);
			extendsGenerics = java.util.Collections.unmodifiableSet(extendsGenerics);
		}
		this.extendsGenerics = extendsGenerics;
	}

	@java.lang.SuppressWarnings("all")
	public static <T> SingularSetBuilder<T, ?, ?> builder() {
		return new SingularSetBuilderImpl<T>();
	}
}
