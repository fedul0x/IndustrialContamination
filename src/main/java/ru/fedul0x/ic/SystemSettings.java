/*
 * Copyright 2014 Ivashin Alexey <ivashin.alexei@gmail.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ru.fedul0x.ic;

/**
 *
 * @author Ivashin Alexey <ivashin.alexei@gmail.com>
 */
public class SystemSettings {

    private static SystemSettings INSTANCE = null;
    private String host;
    private int port;
    private String username;
    private String password;

    static {
        INSTANCE = new SystemSettings();
    }

    private SystemSettings() {
        host = "192.168.0.101";
        port = 5432;
        username = "postgres";
        password = "postgres";
    }

    public static SystemSettings getSettings() {
        return INSTANCE;
    }

    public synchronized String getHost() {
        return host;
    }

    public synchronized void setHost(String host) {
        this.host = host;
    }

    public synchronized int getPort() {
        return port;
    }

    public synchronized void setPort(int port) {
        this.port = port;
    }

    public synchronized String getUsername() {
        return username;
    }

    public synchronized void setUsername(String username) {
        this.username = username;
    }

    public synchronized String getPassword() {
        return password;
    }

    public synchronized void setPassword(String password) {
        this.password = password;
    }

}
