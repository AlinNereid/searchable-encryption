package com.searchable_encryption.app;

import com.searchable_encryption.config.TilesConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by Alexandru on 12/1/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {ApplicationClient.class, TilesConfiguration.class})
@WebAppConfiguration
public class AppTest {

    @Test
    public void shouldLoad(){

    }
}
