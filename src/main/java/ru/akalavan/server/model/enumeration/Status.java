package ru.akalavan.server.model.enumeration;

/**
 * Class Status
 *
 * @author Вагин Михаил
 * @since 28.02.2023
 */
public enum Status {
    SERVER_UP("SERVER_UP"),
    SERVER_DOWN("SERVER_DOWN");

    private final String status;

    Status(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
