package com.piedpiper.banking.cqrs.core.commands;

import com.piedpiper.banking.cqrs.core.messages.Message;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public abstract class BaseCommand extends Message {
    public BaseCommand(String id){
        super(id);
    }
}
