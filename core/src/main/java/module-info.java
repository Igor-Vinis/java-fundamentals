import com.igor.library.exceptions.BookNotAvaliableException;

module com.igor.library.core {
    exports com.igor.library.core;
    requires com.igor.library.exceptions;
    requires java.logging;
    requires com.igor.library.io;
    uses BookNotAvaliableException;
}