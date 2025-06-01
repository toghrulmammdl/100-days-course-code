
# Git & GitHub Essential Commands

This guide provides a comprehensive list of essential Git commands for version control and collaboration on GitHub, presented in an easy-to-read table format.

---

## 1. Initial Setup & Configuration

| Command                                                     | Description                                                                                   |
| :---------------------------------------------------------- | :-------------------------------------------------------------------------------------------- |
| `git config --global user.name "Your Name"`               | Sets the name that will appear in your commits.                                               |
| `git config --global user.email "your.email@example.com"` | Sets the email that will appear in your commits. This should ideally match your GitHub email. |
| `git config --global --list`                              | Displays all global Git configuration settings.                                               |

---

## 2. Repository Initialization & Cloning

| Command                  | Description                                                                     |
| :----------------------- | :------------------------------------------------------------------------------ |
| `git init`             | Initializes a new Git repository in the current directory.                      |
| `git clone <repo.url>` | Clones an existing remote repository (e.g., from GitHub) to your local machine. |

---

## 3. Tracking & Committing Changes

| Command                              | Description                                                                                               |
| :----------------------------------- | :-------------------------------------------------------------------------------------------------------- |
| `git status`                       | Shows the status of changes as untracked, modified, or staged.                                            |
| `git add <file_name>`              | Stages a specific file for the next commit.                                                               |
| `git add .`                        | Stages all changes (new and modified files) in the current directory for the next commit.                 |
| `git restore --staged <file_name>` | Unstages a file, but keeps the modifications in your working directory.                                   |
| `git commit -m "commit message"`   | Records staged changes to the repository with a descriptive message.                                      |
| `git commit -am "commit message"`  | Stages all*tracked* modified files and then commits them in one go. (Doesn't add new, untracked files). |

---

## 4. Working with Remote Repositories (GitHub)

| Command                              | Description                                                                                                                               |
| :----------------------------------- | :---------------------------------------------------------------------------------------------------------------------------------------- |
| `git remote -v`                    | Lists the remote repositories configured for your local repo.                                                                             |
| `git remote add origin <repo.url>` | Adds a new remote repository named `origin` to your local repo.                                                                         |
| `git push -u origin <branch_name>` | Pushes your local commits to the specified remote branch for the first time, setting it as the upstream branch.                           |
| `git push`                         | Pushes your local commits to the linked remote branch.                                                                                    |
| `git pull`                         | Fetches changes from the remote repository and merges them into your current local branch. (Equivalent to `git fetch` + `git merge`). |
| `git fetch`                        | Downloads changes from the remote repository, but does not merge them into your local branch.                                             |

---

## 5. Branch Management

| Command                               | Description                                                                    |
| :------------------------------------ | :----------------------------------------------------------------------------- |
| `git branch`                        | Lists all local branches.                                                      |
| `git branch <new_branch_name>`      | Creates a new local branch.                                                    |
| `git checkout <branch_name>`        | Switches to the specified branch.                                              |
| `git checkout -b <new_branch_name>` | Creates a new branch and immediately switches to it (shortcut).                |
| `git merge <branch_name>`           | Merges the specified branch's changes into the current branch.                 |
| `git branch -d <branch_name>`       | Deletes a local branch if it has been merged.                                  |
| `git branch -D <branch_name>`       | Force deletes a local branch, even if it hasn't been merged. Use with caution! |
| `git branch -r`                     | Lists all remote branches.                                                     |
| `git branch -a`                     | Lists all local and remote branches.                                           |

---

## 6. Viewing History & Undoing Changes

| Command                          | Description                                                                                                                                                        |
| :------------------------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `git log`                      | Shows the commit history.                                                                                                                                          |
| `git log --oneline`            | Shows a summarized version of the commit history (one commit per line).                                                                                            |
| `git diff`                     | Shows changes in the working directory that are not yet staged.                                                                                                    |
| `git diff --staged`            | Shows changes that are staged but not yet committed.                                                                                                               |
| `git reset --hard <commit_id>` | Resets the current branch to a specific commit, discarding all changes and commits after it.**Use with extreme caution, as it permanently deletes history!** |
| `git reset --soft <commit_id>` | Resets the current branch to a specific commit, but keeps changes staged.                                                                                          |
| `git reset <file_name>`        | Unstages a file without discarding changes. (Same as `git restore --staged <file_name>`).                                                                        |
| `git revert <commit_id>`       | Creates a new commit that undoes the changes introduced by a specific commit. This is a safer way to undo changes in shared history.                               |
