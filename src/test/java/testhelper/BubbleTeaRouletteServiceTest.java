package testhelper;

import com.techreturners.bubbleteaordersystem.model.BubbleTeaTypeEnum;
import com.techreturners.bubbleteaordersystem.service.BubbleTeaRouletteService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


public class BubbleTeaRouletteServiceTest {
@ParameterizedTest
    @MethodSource("bubbleTeaTypes")
    void BubbleTeaRouletteService (int input,BubbleTeaTypeEnum resultExpected)
{
    RandomStub randomStub=new RandomStub(input);
    BubbleTeaRouletteService bubbleTeaRouletteService = new BubbleTeaRouletteService(randomStub);
    Assertions.assertEquals(resultExpected,bubbleTeaRouletteService.getRandomBubbleTeaType());
}
private static Stream<Arguments>bubbleTeaTypes() {
    return Stream.of(
            Arguments.of(BubbleTeaTypeEnum.OolongMilkTea.ordinal(), BubbleTeaTypeEnum.OolongMilkTea),
            Arguments.of(BubbleTeaTypeEnum.JasmineMilkTea.ordinal(), BubbleTeaTypeEnum.JasmineMilkTea),
            Arguments.of(BubbleTeaTypeEnum.MatchaMilkTea.ordinal(), BubbleTeaTypeEnum.MatchaMilkTea),
            Arguments.of(BubbleTeaTypeEnum.PeachIceTea.ordinal(), BubbleTeaTypeEnum.PeachIceTea),
            Arguments.of(BubbleTeaTypeEnum.LycheeIceTea.ordinal(), BubbleTeaTypeEnum.LycheeIceTea));
}
}
