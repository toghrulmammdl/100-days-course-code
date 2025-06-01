# 🚀 Git & GitHub Essential Commands

A comprehensive and easy-to-follow reference of essential Git commands for version control and collaboration using GitHub.

---

## ⚙️ 1. Initial Setup & Configuration

```bash
git config --global user.name "Your Name"
```

> Sets your name for commits.

```bash
git config --global user.email "your.email@example.com"
```

> Sets your email for commits. Ideally matches your GitHub email.

```bash
git config --global --list
```

> Lists all globally set Git configurations.

---

## 📁 2. Repository Initialization & Cloning

```bash
git init
```

> Initializes a new Git repository in the current directory.

```bash
git clone <repository_url>
```

> Clones a remote repository to your local machine.

---

## ✍️ 3. Tracking & Committing Changes

```bash
git status
```

> Shows the status of changes: untracked, modified, staged.

```bash
git add <file_name>
```

> Stages a specific file for the next commit.

```bash
git add .
```

> Stages all changes (new and modified files) in the current directory.

```bash
git restore --staged <file_name>
```

> Unstages a file without discarding changes.

```bash
git commit -m "your commit message"
```

> Commits the staged changes with a message.

```bash
git commit -am "your commit message"
```

> Stages *tracked* changes and commits in one step (won’t include new untracked files).

---

## 🌐 4. Working with Remote Repositories (GitHub)

```bash
git remote -v
```

> Lists all configured remotes for the current repo.

```bash
git remote add origin <repository_url>
```

> Adds a remote named `origin`.

```bash
git push -u origin <branch_name>
```

> Pushes commits and sets the upstream branch for the first time.

```bash
git push
```

> Pushes local commits to the current remote branch.

```bash
git pull
```

> Fetches and merges remote changes into the current branch.

```bash
git fetch
```

> Fetches changes from the remote without merging them.

---

## 🌿 5. Branch Management

```bash
git branch
```

> Lists all local branches.

```bash
git branch <new_branch_name>
```

> Creates a new branch.

```bash
git checkout <branch_name>
```

> Switches to an existing branch.

```bash
git checkout -b <new_branch_name>
```

> Creates a new branch and switches to it immediately.

```bash
git merge <branch_name>
```

> Merges the specified branch into the current one.

```bash
git branch -d <branch_name>
```

> Deletes a local branch that has been merged.

```bash
git branch -D <branch_name>
```

> Force deletes a local branch (even if not merged).

```bash
git branch -r
```

> Lists all remote branches.

```bash
git branch -a
```

> Lists all local and remote branches.

---

## 📜 6. Viewing History & Undoing Changes

```bash
git log
```

> Shows the commit history.

```bash
git log --oneline
```

> Displays a compact version of the commit history.

```bash
git diff
```

> Shows unstaged changes in your working directory.

```bash
git diff --staged
```

> Shows changes that are staged but not yet committed.

```bash
git reset --hard <commit_id>
```

> ⚠ Resets to a specific commit and discards **all** subsequent changes permanently.

```bash
git reset --soft <commit_id>
```

> Resets to a commit but keeps all changes staged.

```bash
git reset <file_name>
```

> Unstages a file while keeping the changes.

```bash
git revert <commit_id>
```

> Safely undoes a commit by creating a new one that reverses it.
