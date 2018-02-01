/*
 * The contents of this file are subject to the terms 
 * of the Common Development and Distribution License 
 * (the "License").  You may not use this file except 
 * in compliance with the License.
 * 
 * You can obtain a copy of the license at 
 * glassfish/bootstrap/legal/CDDLv1.0.txt or 
 * https://glassfish.dev.java.net/public/CDDLv1.0.html. 
 * See the License for the specific language governing 
 * permissions and limitations under the License.
 * 
 * When distributing Covered Code, include this CDDL 
 * HEADER in each file and include the License file at 
 * glassfish/bootstrap/legal/CDDLv1.0.txt.  If applicable, 
 * add the following below this CDDL HEADER, with the 
 * fields enclosed by brackets "[]" replaced with your 
 * own identifying information: Portions Copyright [yyyy] 
 * [name of copyright owner]
 */

/*
 *
 * Copyright 2005-2006 Sun Microsystems, Inc. All Rights Reserved.
 */


package javax.annotation;

import java.lang.annotation.*;
import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

/**
 * The <code>PreDestroy</code> annotation is used on a method as a 
 * callback notification to signal that the instance is in the 
 * process of being removed by the container. The method annotated 
 * with <code>PreDestroy</code> is typically used to 
 * release resources that it has been holding. This annotation must be 
 * supported by all container-managed objects that support the use of
 * the <code>PostConstruct</code> annotation except the Java EE application 
 * client. The method on which the <code>PreDestroy</code> annotation 
 * is applied must fulfill all of the following criteria:
 * <ul>
 * <li>The method must not have any parameters except in the case of
 * interceptors in which case it takes an <code>InvocationContext</code>
 * object as defined by the Interceptors specification.</li>
 * <li>The method defined on an interceptor class or superclass of an
 * interceptor class must have one of the following signatures:
 * <p>
 * void &#060;METHOD&#062;(InvocationContext)
 * <p>
 * Object &#060;METHOD&#062;(InvocationContext) throws Exception
 * <p>
 * <i>Note: A PreDestroy interceptor method must not throw application
 * exceptions, but it may be declared to throw checked exceptions including
 * the java.lang.Exception if the same interceptor method interposes on
 * business or timeout methods in addition to lifecycle events. If a
 * PreDestroy interceptor method returns a value, it is ignored by
 * the container.</i>
 * </li>
 * <li>The method defined on a non-interceptor class must have the
 * following signature:
 * <p>
 * void &#060;METHOD&#062;()
 * </li>
 * <li>The method on which PreDestroy is applied may be public, protected, 
 * package private or private.</li>
 * <li>The method must not be static.</li>
 * <li>The method should not be final.</li>
 * <li>If the method throws an unchecked exception it is ignored by
 * the container.</li>
 * </ul>
 *
 * @see javax.annotation.PostConstruct
 * @see javax.annotation.Resource
 * @since Common Annotations 1.0
 */

@Documented
@Retention (RUNTIME)
@Target(METHOD)
public @interface PreDestroy {
}
