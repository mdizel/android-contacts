package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<T> {
       boolean theSameAs(T newItemItf);
    boolean equals(Object e);
}
