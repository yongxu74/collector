/**
 *AllJms.java
 *Version1.0
 *2015-3-20
 *Copyright cnendata.com
 *
 */
package com.cnendata.dev.collector.jms;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * jms管理器测试<br>
 * <!--<br>
 * 历史记录：<br>
 * --------------------------------------------------------
 * 2015-3-20,enilu(82552623@qq.com)新建文档<br>
 * 
 * -->
 * 
 * @author enilu(82552623@qq.com)
 * 
 *         since1.0
 */
@RunWith(Suite.class)
@SuiteClasses({ JmsQueueManagerTest.class })
public class AllJms {
}
