
package com.dashboard.commondashboard;


import com.google.common.hash.Hashing;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.nio.charset.StandardCharsets;
import java.util.List;

@ToString
public class Pianification {

    @Id @Getter String _id;
    @Getter Integer testSetConfId;
    @Getter List<TestPerDay> testPerDays;

    public Pianification(Integer testSetConfId,List<TestPerDay> testPerDays) {
        this.testSetConfId = testSetConfId;
        this.testPerDays = testPerDays;
        _id = Hashing.md5().hashString(testSetConfId.toString(), StandardCharsets.UTF_8).toString();
    }

    @AllArgsConstructor
    @ToString
    public static class TestPerDay {
        @Getter @Setter public String day;
        @Getter @Setter public Integer numOfTest;

    }

}
