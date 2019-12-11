package orm;

import java.sql.Date;
import java.time.YearMonth;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class YearMonthConverter implements AttributeConverter<YearMonth, Date> {
	@Override
	public Date convertToDatabaseColumn(YearMonth attribute) {
		return attribute == null ? null : Date.valueOf(attribute.atDay(1));
	}
	
	@Override
	public YearMonth convertToEntityAttribute(Date dbData) {
		return dbData == null ? null : YearMonth.from(dbData.toLocalDate());
	}
}
