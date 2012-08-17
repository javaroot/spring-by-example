/*
 * Copyright 2007-2009 the original author or authors.
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

package org.springbyexample.integration.shoppingCart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springbyexample.integration.book.ShoppingCart;
import org.springframework.integration.Message;
import org.springframework.integration.annotation.MessageEndpoint;

/**
 * The endpoint for a store order.
 * 
 * @author David Winterfeldt
 */
@MessageEndpoint
public class StoreEndpoint {

    final Logger logger = LoggerFactory.getLogger(StoreEndpoint.class);
    
    /**
     * Process an order for a pickup from the store.
     */
	public void processMessage(Message<ShoppingCart> message) {
		ShoppingCart order =  message.getPayload();

        logger.debug("In StoreEndpoint.  orderCount={}", order.getBookOrderList().size()); 

//        logger.debug("In StoreEndpoint.  title='{}'  quantity={}  orderType={}", 
//                new Object[] { order.getTitle(), 
//                               order.getQuantity(),
//                               order.getOrderType() });
	}

}