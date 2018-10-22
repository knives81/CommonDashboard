
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
    @Getter Integer tesetSetConfId;
    @Getter List<TestPerDay> testPerDays;

    public Pianification(Integer tesetSetConfId,List<TestPerDay> testPerDays) {
        this.tesetSetConfId = tesetSetConfId;
        this.testPerDays = testPerDays;
        _id = Hashing.md5().hashString(tesetSetConfId.toString(), StandardCharsets.UTF_8).toString();
    }

    @AllArgsConstructor
    public static class TestPerDay {
        @Getter @Setter public String day;
        @Getter @Setter public Integer numOfTest;

    }

}
