package ru.akalavan.server.service;

import ru.akalavan.server.model.Server;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Collection;

/**
 * Class ServerService
 *
 * @author Вагин Михаил
 * date 28.02.2023
 */
public interface ServerService {
    Server create(Server server);
    Server ping(String ipAddress) throws IOException;
    Collection<Server> list(int limit);
    Server get(Long id);
    Server update(Server server);
    Boolean delete(Long id);
}
