 /*
  * Fergoman123's Util
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package fergoman123.mods.fergoutil.logging;

 import org.apache.logging.log4j.Level;

 public interface ILogLevel
{
    public static final Level all = Level.ALL;
    public static final Level debug = Level.DEBUG;
    public static final Level error = Level.ERROR;
    public static final Level fatal = Level.FATAL;
    public static final Level info = Level.INFO;
    public static final Level off = Level.OFF;
    public static final Level trace = Level.TRACE;
    public static final Level warn = Level.WARN;
}
