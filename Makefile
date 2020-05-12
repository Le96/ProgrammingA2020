REGEX_JAVA := '^\./lec[0-9]{2}/.+\.java$$'
REGEX_CLASS := '^\./lec[0-9]{2}/.+\.class$$'
JAVAC := $(shell which javac)

.PHONY: all
all: build;

.PHONY: build
build:
	@echo '[+] build package.'
	@find . -type f -regextype egrep -regex $(REGEX_JAVA) | xargs -i sh -c 'echo [-] building: {}; $(JAVAC) {}'
	@echo '[i] build finish.'

.PHONY: clean
clean:
	@echo '[+] cleaning source directories.'
	@find . -type f -regextype egrep -regex $(REGEX_CLASS) | xargs -i sh -c 'echo [-] removing: {}; rm {}'
	@echo '[i] cleaning finish.'

.PHONY: rebuild
rebuild: clean build;