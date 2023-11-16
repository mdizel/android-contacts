package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<T> {
    @SuppressWarnings("unused")
    boolean theSameAs(T newItemItf);
    boolean equals(Object e);
}
