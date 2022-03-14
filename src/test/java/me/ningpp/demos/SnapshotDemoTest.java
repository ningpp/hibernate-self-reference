package me.ningpp.demos;

import org.junit.jupiter.api.Test;

/**
 * 
 * @author ningpp
 * @date 2022-03-14 09:19:37
 */
class SnapshotDemoTest {

    @Test
    void notSetMaxFetchDepthTest() {
        SnapshotDemo.demo("snapshot-hibernate-not-set-max-fetch-depth.cfg.xml");
    }

    @Test
    void setMaxFetchDepthTo10Test() {
        SnapshotDemo.demo("snapshot-hibernate-set-max-fetch-depth-to-10.cfg.xml");
    }

}
