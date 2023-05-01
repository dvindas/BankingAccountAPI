package com.piedpiper.banking.account.cmd.application.command;

import com.piedpiper.banking.account.common.dto.AccountType;
import com.piedpiper.banking.cqrs.core.commands.BaseCommand;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;


@Data
@EqualsAndHashCode(callSuper = true)

public class OpenAccountCommand extends BaseCommand {

    private String accountHolder;
    private AccountType accountType;
    private BigDecimal openBalance;



}
