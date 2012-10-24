/*
 * Copyright (c) 2011, 2012, B3log Team
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
package org.b3log.symphony.im;

import java.util.logging.Logger;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * B3log Symphony IM servlet listener.
 *
 * @author <a href="mailto:DL88250@gmail.com">Liang Ding</a>
 * @version 1.0.0.0, Feb 22, 2011
 */
public final class IMServletListener implements ServletContextListener {

    /**
     * Logger.
     */
    private static final Logger LOGGER =
            Logger.getLogger(IMServletListener.class.getName());
    /**
     * Delay mills for first all QQ robots login.
     */
    private static final long KEEP_QQ_ROBOTS_ALIVE_DELAY = 1000;
    /**
     * Live period mills for all QQ robots.
     */
    private static final long QQ_ROBOTS_LIVE_PERIOD = 1000 * 60 * 10;

    @Override
    public void contextInitialized(final ServletContextEvent servletContextEvent) {
        LOGGER.info("Initialized the B3log Symphony IM context");
    }

    @Override
    public void contextDestroyed(final ServletContextEvent servletContextEvent) {
        LOGGER.info("Destroyed the B3log Symphony IM  context");
    }
}

