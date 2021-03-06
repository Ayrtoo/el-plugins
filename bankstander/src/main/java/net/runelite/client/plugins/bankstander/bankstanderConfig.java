/*
 * Copyright (c) 2018, Andrew EP | ElPinche256 <https://github.com/ElPinche256>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.bankstander;

import net.runelite.client.config.Button;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("bankstanderConfig")

public interface bankstanderConfig extends Config
{
	@ConfigItem(
			keyName = "instructions",
			name = "",
			description = "Instructions.",
			position = 0
	)
	default String instructions()
	{
		return "Please select what activity you would like to do below. "+
				"Then enter the item IDs you would like to use for this activity.";
	}

	@ConfigItem(
			keyName = "type",
			name = "",
			description = "Select what activity you would like to do.",
			position = 1
	)
	default bankstanderType type()
	{
		return bankstanderType.USE_ITEM;
	}

	@ConfigItem(
			keyName = "firstId",
			name = "First Item ID",
			description = "Enter the Id of the first item you will use.",
			position = 2
	)
	default int firstId() { return 0; }

	@ConfigItem(
			keyName = "secondId",
			name = "Second Item ID",
			description = "Enter the Id of the second item you will use.",
			position = 3,
			hidden = true,
			unhide = "type",
			unhideValue = "USE_ITEM_ON_ITEM"
	)
	default int secondId()
	{
		return 0;
	}

	@ConfigItem(
			keyName = "toolId",
			name = "Tool ID",
			description = "Enter the Id of the tool you will be using.",
			position = 4,
			hidden = true,
			unhide = "type",
			unhideValue = "USE_TOOL_ON_ITEM"
	)
	default int toolId()
	{
		return 0;
	}

	@ConfigItem(
			keyName = "startButton",
			name = "Start/Stop",
			description = "Test button that changes variable value",
			position = 150
	)
	default Button startButton()
	{
		return new Button();
	}




}