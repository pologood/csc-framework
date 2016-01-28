package com.sankuai.demo;

import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by csophys on 15/12/23.
 */

@Transactional
@ActiveProfiles("test")
public @interface TestWithTransaction {
}
