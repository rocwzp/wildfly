/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2010, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.as.threads;


/**
 *
 * @author <a href="kabir.khan@jboss.com">Kabir Khan</a>
 * @version $Revision: 1.1 $
 */
class Constants {
    static final String ALLOW_CORE_TIMEOUT = "allow-core-timeout";
    static final String BLOCKING = "blocking";
    static final String BOUNDED_QUEUE_THREAD_POOL = "bounded-queue-thread-pool";
    static final String CORE_THREADS_COUNT = "core-threads-count";
    static final String CORE_THREADS_PER_CPU = "core-threads-per-cpu";
    static final String HANDOFF_EXECUTOR = "handoff-executor";
    static final String NAME = "name";
    static final String GROUP_NAME = "group-name";
    static final String KEEPALIVE_TIME_DURATION = "keepalive-time-duration";
    static final String KEEPALIVE_TIME_UNIT = "keepalive-time-unit";
    static final String MAX_THREADS_COUNT = "max-threads-count";
    static final String MAX_THREADS_PER_CPU = "max-threads-per-cpu";
    static final String PRIORITY = "priority";
    static final String PROPERTIES = "properties";
    static final String QUEUELESS_THREAD_POOL = "queueless-thread-pool";
    static final String QUEUE_LENGTH_COUNT = "queue-length-count";
    static final String QUEUE_LENGTH_PER_CPU = "queue-length-per-cpu";
    static final String SCHEDULED_THREAD_POOL = "scheduled-thread-pool";
    static final String THREADS = "threads";
    static final String THREAD_FACTORY = "thread-factory";
    static final String THREAD_NAME_PATTERN = "thread-name-pattern";
    static final String THREAD_POOL = "thread-pool";
    static final String UNBOUNDED_QUEUE_THREAD_POOL = "unbounded-queue-thread-pool";
}
